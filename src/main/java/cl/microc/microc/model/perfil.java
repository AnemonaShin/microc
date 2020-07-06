package cl.microc.microc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Perfil")
@AllArgsConstructor @NoArgsConstructor @Data
public class perfil {
    @Id @Column(precision = 1,name = "id_p")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(length = 25,nullable = false)
    private String Cargo;
    @Column(length = 150,nullable = false)
    private String Descripcion;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinTable(name = "User")
    @JoinColumn(table = "User", name = "id_u")
    private user user;
}