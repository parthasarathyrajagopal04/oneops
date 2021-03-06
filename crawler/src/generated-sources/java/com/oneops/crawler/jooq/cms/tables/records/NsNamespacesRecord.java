/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables.records;


import com.oneops.crawler.jooq.cms.tables.NsNamespaces;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NsNamespacesRecord extends UpdatableRecordImpl<NsNamespacesRecord> implements Record3<Long, String, Timestamp> {

    private static final long serialVersionUID = 458293256;

    /**
     * Setter for <code>kloopzcm.ns_namespaces.ns_id</code>.
     */
    public void setNsId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>kloopzcm.ns_namespaces.ns_id</code>.
     */
    public Long getNsId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>kloopzcm.ns_namespaces.ns_path</code>.
     */
    public void setNsPath(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kloopzcm.ns_namespaces.ns_path</code>.
     */
    public String getNsPath() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kloopzcm.ns_namespaces.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>kloopzcm.ns_namespaces.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return NsNamespaces.NS_NAMESPACES.NS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return NsNamespaces.NS_NAMESPACES.NS_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return NsNamespaces.NS_NAMESPACES.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getNsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNsPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getNsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNsPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsNamespacesRecord value1(Long value) {
        setNsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsNamespacesRecord value2(String value) {
        setNsPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsNamespacesRecord value3(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsNamespacesRecord values(Long value1, String value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NsNamespacesRecord
     */
    public NsNamespacesRecord() {
        super(NsNamespaces.NS_NAMESPACES);
    }

    /**
     * Create a detached, initialised NsNamespacesRecord
     */
    public NsNamespacesRecord(Long nsId, String nsPath, Timestamp created) {
        super(NsNamespaces.NS_NAMESPACES);

        set(0, nsId);
        set(1, nsPath);
        set(2, created);
    }
}
