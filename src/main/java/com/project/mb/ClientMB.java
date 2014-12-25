package com.project.mb;

import javax.faces.bean.ManagedBean;

import org.hibernate.Session;

import com.project.entities.Client;
import com.project.util.HibernateUtil;

@ManagedBean
public class ClientMB {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void guardarCliente()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Client client = new Client(name);
		session.save(client);
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}
