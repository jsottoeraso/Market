package com.jsotto.Market.persistence.mapper;

import com.jsotto.Market.domain.Category;
import com.jsotto.Market.persistence.entity.Categoria;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    //Hace el mapeo inverso de el que ya tenemos
    @InheritInverseConfiguration
     @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
