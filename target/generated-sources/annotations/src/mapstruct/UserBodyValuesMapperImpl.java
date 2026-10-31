package src.mapstruct;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-31T11:26:45+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.20.1 (Microsoft)"
)
public class UserBodyValuesMapperImpl implements UserBodyValuesMapper {

    @Override
    public UserBodyValues userBodyValuesMapper(UserBodyImperialValuesDTO userBodyImperialValuesDTO) {
        if ( userBodyImperialValuesDTO == null ) {
            return null;
        }

        UserBodyValues userBodyValues = new UserBodyValues();

        userBodyValues.setCentimeter( UserBodyValuesMapper.inchToCentimeter( userBodyImperialValuesDTO.getInch() ) );

        return userBodyValues;
    }
}
