package com.tiskel.linkedinscanner.service.mapper;

import com.tiskel.linkedinscanner.domain.Leader;
import com.tiskel.linkedinscanner.service.dto.LeaderDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Leader} and its DTO {@link LeaderDTO}.
 */
@Mapper(componentModel = "spring")
public interface LeaderMapper extends EntityMapper<LeaderDTO, Leader> {}
