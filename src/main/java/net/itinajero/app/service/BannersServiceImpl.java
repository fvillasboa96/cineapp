package net.itinajero.app.service;

import java.util.LinkedList;
import java.util.List;


import net.itinajero.app.model.Banner;

public class BannersServiceImpl implements IBannerService{

	private List<Banner> lista = null;
	
	public BannersServiceImpl() {
		lista = new LinkedList<Banner>();
		
		Banner banner1 = new Banner();
		banner1.setId(1);
		banner1.setTitulo("Proximamente Kong La Isla Calavera");
		banner1.setArchivo("slide1.jpg");
		
		Banner banner2 = new Banner();
		banner2.setId(2);
		banner2.setTitulo("Estreno La bella y la bestia");
		banner2.setArchivo("slide2.jpg");
		
		Banner banner3 = new Banner();
		banner3.setId(3);
		banner3.setTitulo("Este mes no te pierdas Rapidos y Furiosos 8");
		banner3.setArchivo("slide3.jpg");
		
		Banner banner4 = new Banner();
		banner4.setId(4);
		banner4.setTitulo("Estreno en Agosto - Jefe en Pa�ales");
		banner4.setArchivo("slide4.jpg");
		banner4.setEstatus("Inactivo");
		
		lista.add(banner1);
		lista.add(banner2);
		lista.add(banner3);
		lista.add(banner4);
		
		
	}
	
	@Override
	public void guardar(Banner banner) {
		lista.add(banner);

	}

	@Override
	public List<Banner> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public void eliminar(int idBanner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Banner buscarPorId(int idBanner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Banner> buscarActivos() {
		// TODO Auto-generated method stub
		return null;
	}

}
