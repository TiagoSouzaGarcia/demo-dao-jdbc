package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DAOFactory {
	
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC();
	}

}
