package lhf.projects.model.team;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class Organization {

    private UUID id;

    private String designation;
    private LocalDate foundationDate;

    private LocalDate startDate;

    // documents
}
