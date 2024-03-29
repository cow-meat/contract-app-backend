package pers.edwin.contract.service;

import pers.edwin.contract.entity.Contact;
import pers.edwin.contract.enums.ContractStatusEnum;
import pers.edwin.contract.response.PageResponse;

import java.util.List;

/**
 * (Contact)表服务接口
 *
 * @author makejava
 * @since 2020-04-19 17:27:14
 */
public interface ContactService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Contact queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Contact> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param contact 实例对象
     * @return 实例对象
     */
    Contact insert(Contact contact);

    /**
     * 修改数据
     *
     * @param contact 实例对象
     * @return 实例对象
     */
    Contact update(Contact contact);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    PageResponse<Contact> queryPersonalAllPage(Integer employeeId, Integer page, Integer size);

    PageResponse<Contact> queryPersonalCreate(Integer employeeId, Integer page, Integer size);

    PageResponse<Contact> queryPersonalCreate(Integer employeeId, ContractStatusEnum status, Integer page, Integer size);

    PageResponse<Contact> queryPersonalCondition(Integer employeeId, ContractStatusEnum status, Integer page, Integer size);

    PageResponse<Contact> queryBusinessAllPage(Integer companyId, Integer page, Integer size);

    PageResponse<Contact> queryBusinessCondition(Integer companyId, ContractStatusEnum unsigned, Integer page, Integer size);

    PageResponse<Contact> queryBusinessCreate(Integer companyId, Integer page, Integer size);

    PageResponse<Contact> queryBusinessCreate(Integer companyId, ContractStatusEnum status, Integer page, Integer size);
}