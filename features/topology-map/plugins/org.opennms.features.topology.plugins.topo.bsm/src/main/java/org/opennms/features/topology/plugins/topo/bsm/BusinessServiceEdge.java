/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2016 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2016 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.features.topology.plugins.topo.bsm;

import org.opennms.features.topology.api.topo.AbstractEdge;
import org.opennms.netmgt.bsm.service.model.Status;
import org.opennms.netmgt.bsm.service.model.graph.GraphEdge;

public class BusinessServiceEdge extends AbstractEdge {

    private final Status status;

    public BusinessServiceEdge(GraphEdge graphEdge, AbstractBusinessServiceVertex source, AbstractBusinessServiceVertex target) {
        super(BusinessServicesTopologyProvider.TOPOLOGY_NAMESPACE, String.format("connection:%s:%s", source.getId(), target.getId()), source, target);
        this.status = graphEdge.getStatus();
        setTooltipText(String.format("Map function: %s, Weight: %s", graphEdge.getMapFunction().getClass().getSimpleName(), graphEdge.getWeight()));
    }

    private BusinessServiceEdge(BusinessServiceEdge edgeToClone) {
        super(edgeToClone);
        status = edgeToClone.status;
    }

    @Override
    public AbstractEdge clone() {
        return new BusinessServiceEdge(this);
    }

    public Status getOperationalStatus() {
        return status;
    }
}
