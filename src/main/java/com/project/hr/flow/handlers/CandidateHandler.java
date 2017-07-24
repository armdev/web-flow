package com.project.hr.flow.handlers;

import com.project.hr.model.Candidate;
import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Named
@FlowScoped("candidate")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CandidateHandler implements Serializable {
    
    @Inject    
    private Candidate candidate;
   

    
}
