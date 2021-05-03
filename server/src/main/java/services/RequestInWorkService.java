package services;

import entities.Request;
import entities.RequestInWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositoryes.DriverRepository;
import repositoryes.RequestInWorkRepository;
import repositoryes.RequestRepository;
import viewmodels.RequestInWorkVM;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Service
public class RequestInWorkService
{
    @Autowired
    DriverRepository driverRepository;
    @Autowired
    RequestRepository requestRepository;
    @Autowired
    RequestInWorkRepository requestInWorkRepository;



    public RequestInWorkVM add(RequestInWorkVM requestInWorkVM)
    {
        try
        {
            RequestInWork requestInWork = new RequestInWork(
                    requestRepository.getOne(requestInWorkVM.getRequestId()),
                    driverRepository.getOne(requestInWorkVM.getDriverId())
            );
            requestInWork = requestInWorkRepository.save(requestInWork);
            return new RequestInWorkVM(
                    requestInWork.getId(),
                    requestInWork.getDriver().getPassport(),
                    requestInWork.getRequest().getId()
            );
        }
        catch (Exception e)
        {
            return  null;
        }
    }

    public RequestInWorkVM get(Long id)
    {
        try
        {
            RequestInWork requestInWork = requestInWorkRepository.getOne(id);
            return new RequestInWorkVM(
                    requestInWork.getId(),
                    requestInWork.getDriver().getPassport(),
                    requestInWork.getRequest().getId()
            );
        }
        catch (Exception e)
        {
            return null;
        }
    }

    public List<RequestInWorkVM> getAll()
    {
        List<RequestInWork> requestInWorks = requestInWorkRepository.findAll();
        List<RequestInWorkVM> requestInWorkVMS = new ArrayList<>();
        for (RequestInWork requestInWork : requestInWorks)
        {
            requestInWorkVMS.add(new RequestInWorkVM(
                    requestInWork.getId(),
                    requestInWork.getDriver().getPassport(),
                    requestInWork.getRequest().getId()));

        }
        return requestInWorkVMS;
    }

}
