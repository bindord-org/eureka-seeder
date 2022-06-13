package com.bindord.eureka.seeder.domain.service.ids;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
@Getter
@Setter
public class ServiceProposalChatId implements Serializable {

    @Column(name = "ServiceProposalChatId")
    private UUID serviceProposalChatId;

    @Column(name = "ServiceProposalId")
    private UUID serviceProposalId;

    @Column(name = "ServiceRequestId")
    private UUID serviceRequestId;

    @Column(name = "CustomerId")
    private UUID customerId;

    @Column(name = "ProfessionId")
    private Integer professionId;

    public ServiceProposalChatId() {
    }

    public ServiceProposalChatId(UUID serviceProposalChatId, UUID serviceProposalId, UUID serviceRequestId, UUID customerId, Integer professionId) {
        this.serviceProposalChatId = serviceProposalChatId;
        this.serviceProposalId = serviceProposalId;
        this.serviceRequestId = serviceRequestId;
        this.customerId = customerId;
        this.professionId = professionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceProposalChatId that = (ServiceProposalChatId) o;
        return serviceProposalChatId.equals(that.serviceProposalChatId) && serviceProposalId.equals(that.serviceProposalId) && serviceRequestId.equals(that.serviceRequestId) && customerId.equals(that.customerId) && professionId.equals(that.professionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceProposalChatId, serviceProposalId, serviceRequestId, customerId, professionId);
    }
}