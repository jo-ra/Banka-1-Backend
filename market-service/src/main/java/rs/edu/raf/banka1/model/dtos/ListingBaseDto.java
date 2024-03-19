package rs.edu.raf.banka1.model.dtos;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListingBaseDto {
    private Long listingId;
    private String listingType;
    private String ticker;
    private String name;
    private String exchange;
    private Integer lastRefresh;
    private Double price;
    private Double high;
    private Double low;
    private Double priceChange;
    private Integer volume;

}
