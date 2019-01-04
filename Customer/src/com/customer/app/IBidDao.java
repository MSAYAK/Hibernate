package com.customer.app;

import com.lti.model.Bidders;

public interface IBidDao {
public void addBid(Bidders bid);
public void  deleteBid(int m);
public void updateBid(Bidders bid,int b_id);
public void  ListById();
public void ListAllBids();
}
