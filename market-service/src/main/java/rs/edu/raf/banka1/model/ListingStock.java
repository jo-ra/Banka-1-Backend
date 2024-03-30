package rs.edu.raf.banka1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
=======
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
>>>>>>> 456f2936a49ffc41abaaa9d4a91eb35eb46e0a5d
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rs.edu.raf.banka1.model.entities.Exchange;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListingStock extends ListingBase {
    @Column
    private Integer outstandingShares;
    @Column
    private Double dividendYield;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "exchange_id", referencedColumnName = "id")
    private Exchange exchange;

}
