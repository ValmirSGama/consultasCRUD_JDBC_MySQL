package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); // Inseri no banco de dados o objeto passado por parâmetro
	void update(Seller obj); // Atualiza recebendo um objeto como argumento
	void deleteById(Integer id); // Deleta recebendo um objeto como argumento
	Seller findById(Integer id);// Consulta recebendo um objeto id como argumento
	List<Seller> findAll(); // Consulta retornado uma lista completa do "Seller" 
}
