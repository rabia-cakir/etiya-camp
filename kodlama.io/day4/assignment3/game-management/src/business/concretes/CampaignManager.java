package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.DataRepository;
import entities.Campaign;

import java.util.List;

public class CampaignManager implements CampaignService {
    private DataRepository dataRepository;

    public CampaignManager(DataRepository dataRepository)
    {
        this.dataRepository=dataRepository;
    }

    @Override
    public List<Campaign> getAllCampaigns() {
        return dataRepository.getAll();
    }

    @Override
    public void add(Campaign campaign) {
        dataRepository.add(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        dataRepository.delete(campaign);

    }

    @Override
    public void update(Campaign campaign) {
       dataRepository.update(campaign);

    }
}
