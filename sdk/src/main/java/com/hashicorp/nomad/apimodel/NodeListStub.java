package com.hashicorp.nomad.apimodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hashicorp.nomad.javasdk.ApiObject;
import com.hashicorp.nomad.javasdk.NomadJson;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

/**
 * This is a generated JavaBean representing a request or response structure.
 *
 * @see <a href="https://www.nomadproject.io/docs/http/index.html">Nomad HTTP API</a> documentation associated with the endpoint you are using.
 */
public final class NodeListStub extends ApiObject {
    private String id;
    private String datacenter;
    private String name;
    private String nodeClass;
    private boolean drain;
    private String status;
    private String statusDescription;
    private BigInteger createIndex;
    private BigInteger modifyIndex;

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    public NodeListStub setId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("Datacenter")
    public String getDatacenter() {
        return datacenter;
    }

    public NodeListStub setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public NodeListStub setName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("NodeClass")
    public String getNodeClass() {
        return nodeClass;
    }

    public NodeListStub setNodeClass(String nodeClass) {
        this.nodeClass = nodeClass;
        return this;
    }

    @JsonProperty("Drain")
    public boolean getDrain() {
        return drain;
    }

    public NodeListStub setDrain(boolean drain) {
        this.drain = drain;
        return this;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    public NodeListStub setStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("StatusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    public NodeListStub setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    @JsonProperty("CreateIndex")
    public BigInteger getCreateIndex() {
        return createIndex;
    }

    public NodeListStub setCreateIndex(BigInteger createIndex) {
        this.createIndex = createIndex;
        return this;
    }

    @JsonProperty("ModifyIndex")
    public BigInteger getModifyIndex() {
        return modifyIndex;
    }

    public NodeListStub setModifyIndex(BigInteger modifyIndex) {
        this.modifyIndex = modifyIndex;
        return this;
    }

    @Override
    public String toString() {
        return NomadJson.serialize(this);
    }

    public static NodeListStub fromJson(String json) throws IOException {
        return NomadJson.deserialize(json, NodeListStub.class);
    }

    public static List<NodeListStub> fromJsonArray(String json) throws IOException {
        return NomadJson.deserializeList(json, NodeListStub.class);
    }
}
