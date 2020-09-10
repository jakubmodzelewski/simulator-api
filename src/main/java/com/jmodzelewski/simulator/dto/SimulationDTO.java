package com.jmodzelewski.simulator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimulationDTO {
    Long id;
    List<NodeDTO> nodes = new LinkedList<>();
    List<LinkDTO> links = new LinkedList<>();
}
