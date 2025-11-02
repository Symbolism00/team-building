package lhf.projects.controller;

import io.micronaut.http.annotation.*;
import lhf.projects.dto.CreateHalfNewTeamDto;
import lhf.projects.dto.CreateFullNewTeamDto;
import lombok.NonNull;

@Controller("/teams")
public class TeamControllerImpl implements TeamController {

    @Post("/full-new")
    @Override
    public String createFullNew(@NonNull @Body final CreateFullNewTeamDto teamToCreate) {
        System.out.println(teamToCreate);
        return "createFullNew";
    }

    @Post("/half-new")
    @Override
    public String createHalfNew(@NonNull @Body final CreateHalfNewTeamDto teamToCreate) {
        System.out.println(teamToCreate);
        return "createHalfNew";
    }
}
