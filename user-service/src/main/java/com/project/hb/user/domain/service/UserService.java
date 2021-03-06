package com.project.hb.user.domain.service;

import com.project.hb.user.domain.model.entity.User;
import com.project.hb.user.domain.model.entity.Entity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author Sourabh Sharma
 */
public interface UserService {

    /**
     *
     * @param booking
     * @throws Exception
     */
    public void add(User booking) throws Exception;

    /**
     *
     * @param booking
     * @throws Exception
     */
    public void update(User booking) throws Exception;

    /**
     *
     * @param id
     * @throws Exception
     */
    public void delete(String id) throws Exception;

    /**
     *
     * @param hotelId
     * @return
     * @throws Exception
     */
    public Entity findById(String hotelId) throws Exception;

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public Collection<User> findByName(String name) throws Exception;

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public Collection<User> findByCriteria(Map<String, ArrayList<String>> name) throws Exception;
}
