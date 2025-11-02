package lhf.projects.dto;

import io.micronaut.serde.annotation.Serdeable;
import lombok.NonNull;

import java.time.LocalDate;

@Serdeable.Deserializable
public record CreateOrganizationDto(
        @NonNull
        String designation,
        @NonNull
        LocalDate foundationDate
) {
}
