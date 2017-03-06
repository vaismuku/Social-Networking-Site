package edu.iu.club.connect.service.serviceImplementation;

import edu.iu.club.connect.model.GroupModel;
import edu.iu.club.connect.service.repository.GroupRepository;
import edu.iu.club.connect.service.serviceInterface.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walia on 2/19/2017.
 */

@Service
public class GroupServiceImplementation implements GroupService {

    @Autowired
    GroupRepository groupRepository;
    @Override
    public boolean saveOne(GroupModel groupModel) {
        groupRepository.save(groupModel);
        return true;

    }
}