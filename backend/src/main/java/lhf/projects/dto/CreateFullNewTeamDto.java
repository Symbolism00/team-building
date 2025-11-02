package lhf.projects.dto;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.NonNull;

@Introspected
@Serdeable.Deserializable
public record CreateFullNewTeamDto(
        @NonNull
        String name,
        @NonNull
        String acronym,
        @NonNull
        CreateOrganizationDto organization,
        @NonNull
        CreateMemberDto[] members
) {
}
