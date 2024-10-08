package Interfaces;

import java.util.List;

import proye.TblProducto;

public interface IProducto {
	void RegistrarProducto (TblProducto tblProducto);
	void ActualizarProducto(TblProducto tblProducto);
	void EliminarProduct(TblProducto tblProducto);
	List<TblProducto> ListarProducto();
	TblProducto buscarProducto(TblProducto tblProducto);

}
