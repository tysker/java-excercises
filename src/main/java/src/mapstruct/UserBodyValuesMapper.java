package src.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserBodyValuesMapper {

	UserBodyValuesMapper INSTANCE = Mappers.getMapper(UserBodyValuesMapper.class);

	@Mapping(source = "inch", target = "centimeter", qualifiedByName = "inchToCentimeter")
	UserBodyValues userBodyValuesMapper(UserBodyImperialValuesDTO userBodyImperialValuesDTO);

	@Named("inchToCentimeter")
	static double inchToCentimeter(double inch) {
		return inch * 2.54;
	}
}
