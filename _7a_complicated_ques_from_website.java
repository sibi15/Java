public class _7a_complicated_ques_from_website {
    public static void main(String[] args) {
        @Data
        @Entity
        @NoArgsConstructor
        public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        
        private String name;
        private Integer tier;
        }

        @Data
        @NoArgsConstructor
        @Entity
        @Table(name = "product_order")
        public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        
        private LocalDate orderDate;
        private LocalDate deliveryDate;
        private String status;
        
        @ManyToOne
        @JoinColumn(name = "customer_id")
        private Customer customer;
        
        @ManyToMany
        @JoinTable(
            name = "order_product_relationship",
            joinColumns = { @JoinColumn(name = "order_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") }
        )
        @ToString.Exclude
        Set<Product> products;
            
        }

        @Data
        @NoArgsConstructor
        @Entity
        public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        
        private String name;
        private String category;
        @With private Double price;
        
        @ManyToMany(mappedBy = "products")
        @ToString.Exclude
        private Set<Order> orders;
        }

        //1
        List<Product> result = productRepo.findAll()
        .stream()
        .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
        .filter(p -> p.getPrice() > 100)
        .collect(Collectors.toList());

        //2
        List<Order> result = orderRepo.findAll()
        .stream()
        .filter(o -> 
            o.getProducts()
            .stream()
            .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
        )
        .collect(Collectors.toList());  

        //3
        List<Product> result = productRepo.findAll()
        .stream()
        .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
        .map(p -> p.withPrice(p.getPrice() * 0.9))
        .collect(Collectors.toList());  

        //4
        List<Product> result = orderRepo.findAll()
        .stream()
        .filter(o -> o.getCustomer().getTier() == 2)
        .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
        .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
        .flatMap(o -> o.getProducts().stream())
        .distinct()
        .collect(Collectors.toList());
    }
}

