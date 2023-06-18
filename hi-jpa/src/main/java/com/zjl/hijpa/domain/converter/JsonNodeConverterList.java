package com.zjl.hijpa.domain.converter;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;
import java.util.List;

@Converter
public class JsonNodeConverterList implements AttributeConverter<List<String>, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        try {
            return objectMapper.readValue(objectMapper.createParser(attribute.toString()) , String.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        return objectMapper.convertValue(dbData, List.class);
    }
}
