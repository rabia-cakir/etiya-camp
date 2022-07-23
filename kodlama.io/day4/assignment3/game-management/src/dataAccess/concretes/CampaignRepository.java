package dataAccess.concretes;

import dataAccess.abstracts.DataRepository;
import entities.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignRepository implements DataRepository<Campaign> {
    List<Campaign> campaigns=new ArrayList<>();

    @Override
    public List<Campaign> getAll() {
        return campaigns;
    }

    @Override
    public void add(Campaign entity) {
        campaigns.add(entity);
        System.out.println("campaign added succesfully");
    }

    @Override
    public void update(Campaign entity) {
        System.out.println("campaign updated succesfully");
    }

    @Override
    public void delete(Campaign entity) {
        campaigns.remove(entity);
        System.out.println("campaign deleted succesfully");

    }
}
