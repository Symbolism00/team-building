package lhf.projects.dto;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.NonNull;

import java.util.UUID;

@Introspected
@Serdeable.Deserializable
public record CreateHalfNewTeamDto(
        @NonNull
        String name,
        @NonNull
        String acronym,
        @NonNull
        UUID organizationId,
        @NonNull
        CreateMemberDto[] newMembers,
        @NonNull
        UUID[] existingMembers
) {
}
