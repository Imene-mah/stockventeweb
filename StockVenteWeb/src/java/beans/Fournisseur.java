package beans;

// Generated 25 mai 2013 15:25:21 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Fournisseur generated by hbm2java
 */
@Entity
@Table( name = "fournisseur" )
public class Fournisseur implements java.io.Serializable {

    private int               idFournisseur;
    private String            nomFournisseur;
    private String            coordonnees;
    private Set<Stockproduit> stockproduits = new HashSet<Stockproduit>( 0 );

    public Fournisseur() {
    }

    public Fournisseur( int idFournisseur ) {
        this.idFournisseur = idFournisseur;
    }

    public Fournisseur( int idFournisseur, String nomFournisseur, String coordonnees, Set<Stockproduit> stockproduits ) {
        this.idFournisseur = idFournisseur;
        this.nomFournisseur = nomFournisseur;
        this.coordonnees = coordonnees;
        this.stockproduits = stockproduits;
    }

    @Id
    @Column( name = "id_fournisseur", unique = true, nullable = false )
    public int getIdFournisseur() {
        return this.idFournisseur;
    }

    public void setIdFournisseur( int idFournisseur ) {
        this.idFournisseur = idFournisseur;
    }

    @Column( name = "nom_fournisseur", length = 128 )
    public String getNomFournisseur() {
        return this.nomFournisseur;
    }

    public void setNomFournisseur( String nomFournisseur ) {
        this.nomFournisseur = nomFournisseur;
    }

    @Column( name = "coordonnees", length = 128 )
    public String getCoordonnees() {
        return this.coordonnees;
    }

    public void setCoordonnees( String coordonnees ) {
        this.coordonnees = coordonnees;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "fournisseur" )
    public Set<Stockproduit> getStockproduits() {
        return this.stockproduits;
    }

    public void setStockproduits( Set<Stockproduit> stockproduits ) {
        this.stockproduits = stockproduits;
    }

}