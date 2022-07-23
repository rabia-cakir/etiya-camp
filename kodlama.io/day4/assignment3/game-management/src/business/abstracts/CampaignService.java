package business.abstracts;

import entities.Campaign;

import java.util.List;

public interface CampaignService {
    List<Campaign> getAllCampaigns();
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
}
