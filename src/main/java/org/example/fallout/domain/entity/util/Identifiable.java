package org.example.fallout.domain.entity.util;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Identifiable implements HasId {

    @Id
    @UuidGenerator
    @Column(name = "ID", nullable = false, length = 36, unique = true)
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID id;
}
