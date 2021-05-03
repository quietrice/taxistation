package services;

import entities.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositoryes.RequestRepository;
import repositoryes.UserRepository;
import viewmodels.RequestVM;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequestServiceImpl {
    @Autowired
    RequestRepository requestRepository;
    @Autowired
    UserRepository userRepo;

    public RequestVM add(RequestVM requestVM){

        try {
            Request request = new Request(
                    requestVM.getId(),
                    requestVM.getCustomer_phone(),
                    requestVM.getStart(),
                    requestVM.getEnd(),
                    userRepo.getOne(requestVM.getUserId())
                    );
            request = requestRepository.save(request);
            return new RequestVM(
                    request.getId(),
                    request.getCustomer_phone(),
                    request.getStartPoint(),
                    request.getEndPoint(),
                    request.getUser().getId());
        }
        catch (Exception e)
        {
            return null;
        }
    }
    public boolean delete(Long id)
    {
        try {
            requestRepository.deleteById(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public RequestVM get(Long id){
        try {
            Request request = requestRepository.getOne(id);
            RequestVM requestVM = new RequestVM(
                    request.getId(),
                    request.getCustomer_phone(),
                    request.getStartPoint(),
                    request.getEndPoint(),
                    request.getUser().getId());
            try {
                Long driverId = request.getInWork().getDriver().getPassport();
                requestVM.setDriverID(driverId);
            }
            catch (Exception e)
            {
                return requestVM;
            }
            return requestVM;
        }
        catch (Exception e)
        {
            return null;
        }
    }

    public List<RequestVM> getAll()
    {
        List<Request> requests = requestRepository.findAll();
        List<RequestVM> requestVMS = new ArrayList<>();
        for (Request request : requests)
        {
            requestVMS.add(new RequestVM(
                    request.getId(),
                    request.getCustomer_phone(),
                    request.getStartPoint(),
                    request.getEndPoint(),
                    request.getUser().getId()
            ));
        }
        return requestVMS;
    }

}
