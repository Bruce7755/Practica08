package TestEntidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import DaoImp.ProductoImp;
import proye.TblProducto;

public class TestProducto {

	public static void main(String[] args) throws ParseException {
		
		TblProducto produc = new TblProducto();
		ProductoImp proimp = new ProductoImp();
		
		String fechaven = "10/05/2005";
		DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaven1 = formato1.parse(fechaven);
		
		//REGISTRO
		/*
		produc.setNombret1("Chocolates");
		produc.setPreciot1(200.5);
		produc.setDescripciont1("Lomo");
		produc.setEstadot1("nuevo");
		produc.setFechavencimt1(fechaven1);
		produc.setFechafabrit1(fechafabri2);
		proimp.RegistrarProducto(produc);
		
		System.out.println("Registo Existoso");
		*/
		//ACTUALIZACIÓN
		
		produc.setIdproducto(3);
		produc.setNomprod("Helado Sublime");
		produc.setPrecio(200.5);
		produc.setCantidad(20);
		produc.setTotal(20);
		produc.setCodbarras("111");
		produc.setNrolote("15544");
		produc.setFechaven(fechaven1);
		proimp.ActualizarProducto(produc);
		
		System.out.println("Registo Existoso");
		
		//ELIMINAR
		
		/*
		produc.setIdproductot1(1);
		proimp.EliminarProducto(produc);
		System.out.println("Dato Eliminado");*/
		
		//LISTADO
		
		/*
		List<TblProductort1> listado = proimp.ListadoProducto();
		for(TblProductort1 lis:listado){
			System.out.println(" Codigo: " + lis.getIdproductot1()+ "nombre: "+ lis.getNombret1()+ "precio "+ lis.getPreciot1()+ "descripcion: " + lis.getDescripciont1()+ "estado " + lis.getEstadot1()+ "fecha venci: " + lis.getFechavencimt1()+ "fecha fabrica: " + lis.getFechafabrit1());
		}*/
		
		
		//	TEST BUSCAR POR CODIGO 
		/*
		produc.setIdproductot1(2);
		TblProductort1 buscarproduc = proimp.BuscarCliente(produc);
		System.out.println(" Codigo: " + buscarproduc.getIdproductot1()+ "nombre: "+ buscarproduc.getNombret1()+ "precio "+ buscarproduc.getPreciot1()+ "descripcion: " + buscarproduc.getDescripciont1()+ "estado " + buscarproduc.getEstadot1()+ "fecha venci: " + buscarproduc.getFechavencimt1()+ "fecha fabrica: " + buscarproduc.getFechafabrit1());
		*/

	}

}
