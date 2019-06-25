package com.xsis.model;

@Entity
@Table (name="barang")
public class Barang {
	
	@Id
	@Column (name="id", nullable=false)
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@private int id;
	
	@Column (name="namaBarang", nullable =false, length=50)
	private String namaBarang;
	
	@Column (name="jenisBarang", length=30)
	private String janisBarang;
	
	@Column (name="kotaPembuat", length =30)
	private String kotaPembuat;
	
	@Column (name="jml_barang")
	private int jml_Barang;
	
	@Column (name="hargaBarang")
	private int hargaBarang;

}
