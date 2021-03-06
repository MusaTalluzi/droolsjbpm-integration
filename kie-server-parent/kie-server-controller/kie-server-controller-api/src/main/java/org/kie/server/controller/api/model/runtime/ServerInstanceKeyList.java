/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.server.controller.api.model.runtime;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "server-instance-key-list")
public class ServerInstanceKeyList {

    @XmlElement(name = "server-instance-key")
    private ServerInstanceKey[] serverInstanceKeys;

    public ServerInstanceKeyList() {
    }

    public ServerInstanceKeyList(ServerInstanceKey[] serverInstanceKeys) {
        this.serverInstanceKeys = serverInstanceKeys;
    }

    public ServerInstanceKeyList(Collection<ServerInstanceKey> serverInstanceKeys) {
        this.serverInstanceKeys = serverInstanceKeys.toArray(new ServerInstanceKey[serverInstanceKeys.size()]);
    }

    public ServerInstanceKey[] getServerInstanceKeys() {
        return serverInstanceKeys;
    }

    public void setServerInstanceKeys(ServerInstanceKey[] serverInstanceKeys) {
        this.serverInstanceKeys = serverInstanceKeys;
    }
}
