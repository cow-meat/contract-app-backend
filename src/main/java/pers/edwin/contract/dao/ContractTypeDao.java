package pers.edwin.contract.dao;

import pers.edwin.contract.entity.ContractType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ContractType)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-19 17:27:15
 */
public interface ContractTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ContractType queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ContractType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param contractType 实例对象
     * @return 对象列表
     */
    List<ContractType> queryAll(ContractType contractType);

    /**
     * 新增数据
     *
     * @param contractType 实例对象
     * @return 影响行数
     */
    int insert(ContractType contractType);

    /**
     * 修改数据
     *
     * @param contractType 实例对象
     * @return 影响行数
     */
    int update(ContractType contractType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}