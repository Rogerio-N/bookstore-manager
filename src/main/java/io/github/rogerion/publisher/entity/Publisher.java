package io.github.rogerion.publisher.entity;

import io.github.rogerion.books.entity.Book;
import io.github.rogerion.entity.Auditable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Publisher extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false,unique = true, length = 100)
    private String code;

    @Column(nullable = false,columnDefinition = "TIMESTAMP")
    private LocalDate foundationDate;

    @OneToMany(mappedBy = "publisher",fetch = FetchType.LAZY)
    private List<Book> books;
}
