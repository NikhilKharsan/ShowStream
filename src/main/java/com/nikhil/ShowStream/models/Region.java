package com.nikhil.ShowStream.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public
class Region extends BaseModel {
    private String name;
}
