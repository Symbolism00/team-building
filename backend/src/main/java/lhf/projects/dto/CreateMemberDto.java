package lhf.projects.dto;

import io.micronaut.serde.annotation.Serdeable;
import lombok.NonNull;

@Serdeable.Deserializable
public record CreateMemberDto(
        @NonNull
        String name,
        @NonNull
        String email
) {
}
