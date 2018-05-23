package edu.zut.cs.javaee.dream.base.dao;

import edu.zut.cs.javaee.dream.base.BaseAbstractTestCase;
import edu.zut.cs.javaee.dream.base.domain.BaseEntity;
import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author liuxiaoming
 *
 * @param <PK>
 * @param <T>
 * @param <D>
 */
@ContextConfiguration(locations = {"classpath:/applicationContextTest-resources.xml",
        "classpath:/applicationContext-dao.xml"})
public class GenericDaoTestCase<PK extends Serializable, T extends BaseEntity, D extends GenericDao<T, PK>>
        extends BaseAbstractTestCase {

    protected PK id;

    protected T entity;

    protected D dao;

    protected List<T> list;

    @Before
    public void setUp() throws Exception {

    }
}
