package com.Restro_Hub.global;

import java.util.ArrayList;
import java.util.List;

import com.Restro_Hub.model.Product;

public class GlobalData {
	
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}

}
