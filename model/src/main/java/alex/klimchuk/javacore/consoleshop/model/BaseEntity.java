package alex.klimchuk.javacore.consoleshop.model;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public abstract class BaseEntity {

    private Long id;

    public BaseEntity() {

    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
