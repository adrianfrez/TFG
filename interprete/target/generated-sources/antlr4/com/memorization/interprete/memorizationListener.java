// Generated from com/memorization/interprete/memorization.g4 by ANTLR 4.5.1
package com.memorization.interprete;
	
	import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link memorizationParser}.
 */
public interface memorizationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link memorizationParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(memorizationParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(memorizationParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(memorizationParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(memorizationParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(memorizationParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(memorizationParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(memorizationParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(memorizationParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(memorizationParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(memorizationParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(memorizationParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(memorizationParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typesProtection}.
	 * @param ctx the parse tree
	 */
	void enterTypesProtection(memorizationParser.TypesProtectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typesProtection}.
	 * @param ctx the parse tree
	 */
	void exitTypesProtection(memorizationParser.TypesProtectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(memorizationParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(memorizationParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(memorizationParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(memorizationParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(memorizationParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(memorizationParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(memorizationParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(memorizationParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(memorizationParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(memorizationParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(memorizationParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(memorizationParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(memorizationParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(memorizationParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(memorizationParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(memorizationParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(memorizationParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(memorizationParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(memorizationParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(memorizationParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(memorizationParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(memorizationParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(memorizationParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(memorizationParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(memorizationParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(memorizationParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(memorizationParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(memorizationParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#memorizationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemorizationDeclaration(memorizationParser.MemorizationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#memorizationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemorizationDeclaration(memorizationParser.MemorizationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#startMemorization}.
	 * @param ctx the parse tree
	 */
	void enterStartMemorization(memorizationParser.StartMemorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#startMemorization}.
	 * @param ctx the parse tree
	 */
	void exitStartMemorization(memorizationParser.StartMemorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeOfLabels}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfLabels(memorizationParser.TypeOfLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeOfLabels}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfLabels(memorizationParser.TypeOfLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(memorizationParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(memorizationParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(memorizationParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(memorizationParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#methodTypeOfReturn}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeOfReturn(memorizationParser.MethodTypeOfReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#methodTypeOfReturn}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeOfReturn(memorizationParser.MethodTypeOfReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#methodThrows}.
	 * @param ctx the parse tree
	 */
	void enterMethodThrows(memorizationParser.MethodThrowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#methodThrows}.
	 * @param ctx the parse tree
	 */
	void exitMethodThrows(memorizationParser.MethodThrowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(memorizationParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(memorizationParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(memorizationParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(memorizationParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(memorizationParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(memorizationParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(memorizationParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(memorizationParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(memorizationParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(memorizationParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(memorizationParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(memorizationParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(memorizationParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(memorizationParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(memorizationParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(memorizationParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(memorizationParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(memorizationParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(memorizationParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(memorizationParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(memorizationParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(memorizationParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(memorizationParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(memorizationParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(memorizationParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(memorizationParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(memorizationParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(memorizationParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(memorizationParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(memorizationParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(memorizationParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(memorizationParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(memorizationParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(memorizationParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#primitivesTypes}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivesTypes(memorizationParser.PrimitivesTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#primitivesTypes}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivesTypes(memorizationParser.PrimitivesTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(memorizationParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(memorizationParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(memorizationParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(memorizationParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(memorizationParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(memorizationParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(memorizationParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(memorizationParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(memorizationParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(memorizationParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(memorizationParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(memorizationParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(memorizationParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(memorizationParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(memorizationParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(memorizationParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(memorizationParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(memorizationParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(memorizationParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(memorizationParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(memorizationParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(memorizationParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(memorizationParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(memorizationParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(memorizationParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(memorizationParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(memorizationParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(memorizationParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(memorizationParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(memorizationParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(memorizationParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(memorizationParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(memorizationParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(memorizationParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(memorizationParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(memorizationParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(memorizationParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(memorizationParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(memorizationParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(memorizationParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(memorizationParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(memorizationParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(memorizationParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(memorizationParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(memorizationParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(memorizationParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(memorizationParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(memorizationParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(memorizationParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(memorizationParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(memorizationParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(memorizationParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(memorizationParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(memorizationParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(memorizationParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(memorizationParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(memorizationParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(memorizationParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(memorizationParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(memorizationParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(memorizationParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(memorizationParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(memorizationParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(memorizationParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(memorizationParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(memorizationParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(memorizationParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(memorizationParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(memorizationParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(memorizationParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(memorizationParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(memorizationParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(memorizationParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(memorizationParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(memorizationParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(memorizationParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(memorizationParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(memorizationParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(memorizationParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(memorizationParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(memorizationParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(memorizationParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(memorizationParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(memorizationParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(memorizationParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(memorizationParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(memorizationParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(memorizationParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(memorizationParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(memorizationParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(memorizationParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(memorizationParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(memorizationParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(memorizationParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(memorizationParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(memorizationParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(memorizationParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(memorizationParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(memorizationParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(memorizationParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(memorizationParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(memorizationParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(memorizationParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(memorizationParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(memorizationParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(memorizationParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(memorizationParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(memorizationParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(memorizationParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(memorizationParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(memorizationParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(memorizationParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(memorizationParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(memorizationParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(memorizationParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(memorizationParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(memorizationParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(memorizationParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(memorizationParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(memorizationParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(memorizationParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(memorizationParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link memorizationParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(memorizationParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memorizationParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(memorizationParser.ArgumentsContext ctx);
}