package labshoppubsub.domain;

import java.util.*;
import labshoppubsub.domain.*;
import labshoppubsub.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class Ordecancelled extends AbstractEvent {

    private Long id;

    public Ordecancelled(Order aggregate) {
        super(aggregate);
    }

    public Ordecancelled() {
        super();
    }
    // keep

}
