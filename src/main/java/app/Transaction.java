package app;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Transaction {

    private String category;
    private String message;
    private String type;
    private int trax_num;
    private @Id
    @GeneratedValue int user_num;
    private Date date;
    private BigDecimal trax_amt;


    public Transaction(){
        this.message = "aww, you got yourself an error :(";
    }


    public Transaction(int trax_num, Date date, float trax_amt, String category, String message, int user_num, String type){
        this.category = category;
        this.date = date;
        this.message = message;
        this.trax_amt = new BigDecimal(Float.toString(trax_amt));
        this.trax_num = trax_num;
        this.type = type;
        this.user_num = user_num;
    }

    public String getMessage() {
        return message;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public int getTrax_num() {
        return trax_num;
    }

    public int getUser_num() {
        return user_num;
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getTrax_amt() {
        return trax_amt;
    }
}
