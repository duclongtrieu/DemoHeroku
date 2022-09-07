package com.vti.Entity;import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  int id;
        private  String productName;
        private  String price;
}
