package me.pckv.kompis.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Listing {
    @Id @GeneratedValue private long id;
    @NotNull private String title;
    @NotNull private boolean driver;
    @NotNull @OneToOne private Location location;
}
