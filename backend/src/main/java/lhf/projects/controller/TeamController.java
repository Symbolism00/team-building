package lhf.projects.controller;

import lhf.projects.dto.CreateHalfNewTeamDto;
import lhf.projects.dto.CreateFullNewTeamDto;

public interface TeamController {

    String createFullNew(CreateFullNewTeamDto teamToCreate);

    String createHalfNew(CreateHalfNewTeamDto teamToCreate);
}
