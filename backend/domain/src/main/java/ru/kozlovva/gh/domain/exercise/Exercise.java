package ru.kozlovva.gh.domain.exercise;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.kozlovva.gh.core.entity.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Body muscle map
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Exercise extends Entity<String> {

    private String name;
    private String description;
    private TargetMuscle targetMuscle;
    private List<TargetMuscle> muscleHelpers = new ArrayList<>();

    public Exercise(String s, String name, String description, TargetMuscle targetMuscle, List<TargetMuscle> muscleHelpers) {
        super(s);
        this.name = name;
        this.description = description;
        this.targetMuscle = targetMuscle;
        if (muscleHelpers != null)
            this.muscleHelpers = muscleHelpers;
    }

    public enum TargetMuscle {
        TRICEPS,
        BICEPS,
        PECTORALIS_MAJOR,
        EXTERNAL_OBLIQUE,
        INTERNAL_OBLIQUE,
        PALMARIS_LONGUS,
        RECTUS_ADBOMINIS,
        RECTUS_FEMORIS,
        VASTUS_LATERALIS,
        VASTUS_INTERMADIUS,
        VARTUS_MEDIALIS,
        TIBIALIS_ANTERIOR,
        SARTORIUS,
        QUADRICEPS,
        DELTOID,
        LATISSIMUS_DORSI,
        GLUTEUS_MEDIUS,
        GLUTEUS_MAXIMUS,
        THE_HAND,
        LATERAL_GASTROCNEMIUS,
        SOLEIS,
        ACHILLES_TENDON
    }

}
