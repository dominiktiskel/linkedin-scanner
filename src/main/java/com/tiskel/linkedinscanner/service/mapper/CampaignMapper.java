package com.tiskel.linkedinscanner.service.mapper;

import com.tiskel.linkedinscanner.domain.Campaign;
import com.tiskel.linkedinscanner.service.dto.CampaignDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Campaign} and its DTO {@link CampaignDTO}.
 */
@Mapper(componentModel = "spring")
public interface CampaignMapper extends EntityMapper<CampaignDTO, Campaign> {}
