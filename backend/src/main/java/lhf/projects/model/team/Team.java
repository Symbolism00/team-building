package lhf.projects.model.team;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class Team {

    private UUID id;

    private String name;
    private String acronym;

    private Organization organization;

    private LocalDate startDate;

    // reputation

    public Team(final UUID id, final String name, final String acronym, final Organization organization,
                final LocalDate startDate) {
        setId(id);
        setName(name);
        setAcronym(acronym);
        setOrganization(organization);
        setStartDate(startDate);
    }

    public void setId(final UUID id) {
        if(id == null) {
            throw new IllegalArgumentException("The team's ID can't be empty");
        }
        this.id = id;
    }

    public void setName(final String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("The team's name can't be empty");
        }
        this.name = name;
    }

    public void setAcronym(final String acronym) {
        if(acronym == null || acronym.isBlank()) {
            throw new IllegalArgumentException("The team's acronym can't be empty");
        }
        this.acronym = acronym;
    }

    public void setOrganization(final Organization organization) {
        if(organization == null) {
            throw new IllegalArgumentException("The team's organization can't be empty");
        }
        this.organization = organization;
    }

    public void setStartDate(final LocalDate startDate) {
        if(startDate == null) {
            throw new IllegalArgumentException("The team's start date can't be empty");
        }
        this.startDate = startDate;
    }
}
